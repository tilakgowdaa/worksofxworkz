package in.net.liveasy.assignment.liveasy;

import java.util.List;
import java.util.UUID;

public interface LiveasyService {

	public boolean savePayload(Payload payload);

	public List<Payload> fetchAll();

	public Payload fetchPaylaod(UUID id);

	public void delete(UUID id);

	public void update(UUID id,Payload payload);
}
