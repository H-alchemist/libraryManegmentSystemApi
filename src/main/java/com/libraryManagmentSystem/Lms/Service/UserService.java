package com.libraryManagmentSystem.Lms.Service;

import com.libraryManagmentSystem.Lms.Model.User;
import com.libraryManagmentSystem.Lms.repo.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepo UR;




    public User add(User user){
        return UR.save(user);
    }



    public boolean checkUser(User user){
        try {
            User S=UR.findById(user.getId()).get();

            if(S.getPassword()==user.getPassword()){
                return true;
            }else {
                return false;
            }

        }catch (EntityNotFoundException e){
            return false;
        }





    }

    public void addBookToCollection(Long userId, Long bookId) {
        // Step 1: Retrieve the User entity
        User user = UR.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));

        // Step 2: Add the book ID to the user's collection
        ArrayList<Long> collection = user.getCollection();
        if (collection == null) {
            collection = new ArrayList<>();
        }
        collection.add(bookId);
        user.setCollection(collection);

        // Step 3: Save the updated User entity
        UR.save(user);
    }






}
