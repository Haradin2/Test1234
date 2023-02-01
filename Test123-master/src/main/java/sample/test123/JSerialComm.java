package sample.test123;

import java.io.InputStream;
import java.io.OutputStream;

import com.fazecast.jSerialComm.SerialPort;

public class JSerialComm {
    private SerialPort serialPort;

    public void openPort(String portName) {
        serialPort = SerialPort.getCommPort(portName);
        serialPort.openPort();
        serialPort.setBaudRate(9600);
    }

    public void closePort() {
        serialPort.closePort();
    }

    public void writeData(byte[] data) {
        OutputStream output = serialPort.getOutputStream();
        try {
            output.write(data);
        } catch (Exception e) {
            System.out.println("Error writing data to port: " + e.getMessage());
        }
    }

    public byte[] readData() {
        InputStream input = serialPort.getInputStream();
        byte[] readBuffer = new byte[serialPort.bytesAvailable()];
        try {
            input.read(readBuffer, 0, readBuffer.length);
        } catch (Exception e) {
            System.out.println("Error reading data from port: " + e.getMessage());
        }
        return readBuffer;
    }
}