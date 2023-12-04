package org.softuni.luxwatches.controller;

import org.softuni.luxwatches.model.dto.WatchDTO;
import org.softuni.luxwatches.service.watch.WatchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WatchController {
    private final WatchService watchService;

    public WatchController(WatchService watchService) {
        this.watchService = watchService;
    }

    @GetMapping("watches")
    public String listWatches(Model model) {
        List<WatchDTO> watches = watchService.findAllWatches();
        model.addAttribute("watches", watches);
        return "watches";
    }
}
