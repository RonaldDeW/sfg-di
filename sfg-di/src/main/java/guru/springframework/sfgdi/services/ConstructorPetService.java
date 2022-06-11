package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorPetService implements PetService {
    @Override
    public String getPetType() {
        return "Pet Service - Constructor";
    }
}
