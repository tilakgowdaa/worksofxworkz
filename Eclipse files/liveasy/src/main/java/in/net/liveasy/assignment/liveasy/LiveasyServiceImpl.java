package in.net.liveasy.assignment.liveasy;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiveasyServiceImpl implements LiveasyService {

	@Autowired
	private LiveasyRepo repo;

	@Override
	public boolean savePayload(Payload payload) {
		repo.save(payload);
		return true;
	}

	@Override
	public List<Payload> fetchAll() {
		return repo.findAll();
	}

	@Override
	public Payload fetchPaylaod(UUID id) {
		if (id != null) {
			Payload data = repo.findById(id).get();
			return data;
		} else {
			return null;
		}

	}

	@Override
	public void update(UUID id, Payload payload) {
		Payload payloadOld = repo.findById(id).get();
		BeanUtils.copyProperties(payload, payloadOld);
		repo.save(payloadOld);
		return;
	}

	@Override
	public void delete(UUID id) {
		repo.deleteById(id);
		return;
	}

}
