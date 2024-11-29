package com.example.petservices.Service;

import com.example.petservices.Models.Pet;
import com.example.petservices.Repositories.PetRepository;
import java.util.List;
import java.util.Optional;

public class PetService {

    private PetRepository petRepository;

    public Pet salvarPet(Pet pet) {
        return petRepository.save(pet);
    }
    public List<Pet> listarPets() {
        return petRepository.findAll();
    }
    public Optional<Pet> obterPetPorId(Long id) {
        return petRepository.findById(id);
    }
    public void deletarPet(Long id) {
        petRepository.deleteById(id);
    }
}


