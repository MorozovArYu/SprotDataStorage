package com.example.liderit.services;

import com.example.liderit.models.Team;
import com.example.liderit.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team addTeam(Team team){
        return teamRepository.saveAndFlush(team);

    }

    public Optional<Team> getTeam(Integer id){
        return teamRepository.findById(id);
    }

    public void deleteTeam(Integer id){
        teamRepository.deleteById(id);
    }

    public List<Team> findAll(){
        return teamRepository.findAll();
    }

}