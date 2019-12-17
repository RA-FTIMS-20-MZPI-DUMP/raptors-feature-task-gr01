package pl.raptors.raptorsRobotsApp.controller.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.raptors.raptorsRobotsApp.domain.type.RoutePriority;
import pl.raptors.raptorsRobotsApp.service.type.RoutePriorityService;


import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/type/route-priorities")
public class RoutePriorityController {
    @Autowired
    RoutePriorityService routePriorityService;

    @GetMapping("/all")
    public List<RoutePriority> getAll() {
        return routePriorityService.getAll();
    }

    @PostMapping("/add")
    public RoutePriority add(@RequestBody @Valid RoutePriority routePriority) {
        return routePriorityService.addOne(routePriority);
    }

    @GetMapping("/{id}")
    public RoutePriority getOne(@PathVariable String id) {
        return routePriorityService.getOne(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid RoutePriority routePriority) {
        routePriorityService.deleteOne(routePriority);
    }
}
