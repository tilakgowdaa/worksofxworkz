package in.net.liveasy.assignment.liveasy;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveasyController {
	@Autowired
	private LiveasyService service;

	@PostMapping("/load")
	public String addPayload(@RequestBody Payload payload) {
		boolean saved = service.savePayload(payload);
		if (saved = true) {
			return "loads details added successfully";
		} else {
			return "Unable to save";
		}
	}

	@GetMapping("/load")
	public List<Payload> retrieveAll() {
		if (service.fetchAll() != null) {
			return service.fetchAll();
		}
		return Collections.emptyList();

	}

	@GetMapping("/load/{id}")
	public Payload retrievePayload(@PathVariable UUID id) {
		Payload payload = service.fetchPaylaod(id);
		return payload;
	}

	@PutMapping("/load/{id}")
	public String updateLoad(@PathVariable UUID id, @RequestBody Payload payload) {
		service.update(id, payload);
		return "updated";
	}

	@DeleteMapping("load/{id}")
	public String deleteLoad(@PathVariable UUID id) {
		service.delete(id);
		return "Deleted Successfully";
	}

}
