package com.bilgeadam.service;

import com.bilgeadam.dto.request.ProfileRequestDto;
import com.bilgeadam.mapper.ProfileMapper;
import com.bilgeadam.repository.IProfileRepository;
import com.bilgeadam.repository.entity.Profile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final IProfileRepository repository;
    private final ProfileMapper profileMapper;

    public void save(ProfileRequestDto dto){
        Profile profile = profileMapper.toProfile(dto);
        repository.save(profile);
    }
    public void update(Profile profile){
        repository.save(profile);
    }
    public void delete(Profile profile){
        repository.delete(profile);
    }
    public List<Profile> findAll(){
        return repository.findAll();
    }

    public Optional<Profile> findByAuthId(long id){
        return repository.findByAuthid(id);
    }

    public Optional<Profile> findById(String id){
        return repository.findById(id);
    }

}