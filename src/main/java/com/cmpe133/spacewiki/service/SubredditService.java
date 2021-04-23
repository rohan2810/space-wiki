package com.cmpe133.spacewiki.service;

import com.cmpe133.spacewiki.dto.SubredditDto;
import com.cmpe133.spacewiki.exception.SpaceWikiException;
import com.cmpe133.spacewiki.mapper.SubredditMapper;
import com.cmpe133.spacewiki.model.Subreddit;
import com.cmpe133.spacewiki.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {
    private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;

    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit subreddit = subredditMapper.mapDtoToSubreddit(subredditDto);
        Subreddit save = subredditRepository.save(subreddit);
        subredditDto.setId(save.getId());
        return subredditDto;

    }

//    private Subreddit mapSubredditDto(SubredditDto subredditDto) {
//        return Subreddit.builder().name("/sw/" + subredditDto.getName()).description(subredditDto.getDescription()).build();
//    }

    @Transactional(readOnly = true)
    public List<SubredditDto> getAll() {
        return subredditRepository.findAll().stream()
                .map(subredditMapper::mapSubredditToDto).collect(Collectors.toList());
    }

    //    private SubredditDto mapToDto(Subreddit subreddit) {
//        return SubredditDto.builder().name(subreddit.getName())
//                .id(subreddit.getId())
//                .numberOfPosts(subreddit.getPosts().size())
//                .build();
//    }
    public SubredditDto getSubreddit(Long id) {
        Subreddit subreddit = subredditRepository.findById(id)
                .orElseThrow(() -> new SpaceWikiException(("No subreddit found with the given id " + id)));
        return subredditMapper.mapSubredditToDto(subreddit);
    }
}
