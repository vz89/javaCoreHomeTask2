package com.vz89.hometask.service;

import com.vz89.hometask.model.Skill;
import com.vz89.hometask.repository.SkillRepository;
import com.vz89.hometask.repository.json.JsonSkillRepositoryImpl;

import java.util.List;

public class SkillServiceImpl implements SkillService {
    private SkillRepository skillRepository = new JsonSkillRepositoryImpl();

    @Override
    public Skill getById(Long readLong) {
        return skillRepository.getById(readLong);
    }

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill save(String skillName) {
        return skillRepository.save(new Skill(skillName));
    }

    @Override
    public Skill update(Long id, String newName) {
        return skillRepository.update(new Skill(id, newName));
    }

    @Override
    public void delete(Long id) {
        skillRepository.deleteById(id);
    }
}