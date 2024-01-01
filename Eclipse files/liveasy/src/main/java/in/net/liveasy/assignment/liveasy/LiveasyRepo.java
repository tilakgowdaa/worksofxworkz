package in.net.liveasy.assignment.liveasy;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveasyRepo extends JpaRepository<Payload, UUID> {

}
