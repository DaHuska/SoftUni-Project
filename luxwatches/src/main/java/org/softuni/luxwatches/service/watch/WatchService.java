package org.softuni.luxwatches.service.watch;

import org.softuni.luxwatches.model.dto.WatchDTO;

import java.util.List;

public interface WatchService {
    List<WatchDTO> findAllWatches();

}
