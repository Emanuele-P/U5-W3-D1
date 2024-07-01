package ep2024.u5w3d1.repositories;

import ep2024.u5w3d1.entities.Device;
import ep2024.u5w3d1.enums.DeviceAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DevicesDAO extends JpaRepository<Device, UUID> {
    List<Device> findAllByAvailability(DeviceAvailability availability);
}
