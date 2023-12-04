package org.softuni.luxwatches.service.watch;

import org.modelmapper.ModelMapper;
import org.softuni.luxwatches.model.dto.WatchDTO;
import org.softuni.luxwatches.model.entity.Watch;
import org.softuni.luxwatches.repo.WatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchServiceImpl implements WatchService {
    private final ModelMapper modelMapper;
    private final WatchRepository watchRepository;

    public WatchServiceImpl(ModelMapper modelMapper, WatchRepository watchRepository) {
        this.modelMapper = modelMapper;
        this.watchRepository = watchRepository;
    }

    @Override
    public List<WatchDTO> findAllWatches() {
        List<Watch> foundWatches = watchRepository.findAll();

        List<WatchDTO> mappedWatches = foundWatches
                .stream()
                .map(watch -> modelMapper.map(watch, WatchDTO.class))
                .toList();

        return mappedWatches;
    }
}
