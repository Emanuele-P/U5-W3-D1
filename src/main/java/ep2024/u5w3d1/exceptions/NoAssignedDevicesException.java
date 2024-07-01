package ep2024.u5w3d1.exceptions;

public class NoAssignedDevicesException extends RuntimeException {
    public NoAssignedDevicesException() {
        super("No devices are currently assigned.");
    }
}
