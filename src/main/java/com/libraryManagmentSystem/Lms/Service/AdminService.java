package com.libraryManagmentSystem.Lms.Service;

import com.libraryManagmentSystem.Lms.Model.Admin;
import com.libraryManagmentSystem.Lms.Model.User;
import com.libraryManagmentSystem.Lms.repo.AdminRepo;
import com.libraryManagmentSystem.Lms.repo.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminService {



    @Autowired
    private AdminRepo AR;




    public Admin add(Admin admin){
        return AR.save(admin);
    }



    public boolean checkAdmin(Admin admin){
        try {
            Admin A=AR.findById(admin.getId()).get();

            if(A.getPassword()==admin.getPassword()){
                return true;
            }else {
                return false;
            }

        }catch (EntityNotFoundException e){
            return false;
        }





    }





}
