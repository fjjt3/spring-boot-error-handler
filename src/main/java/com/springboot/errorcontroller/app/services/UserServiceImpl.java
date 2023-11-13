
package com.springboot.errorcontroller.app.services;
import java.util.ArrayList;
import com.springboot.errorcontroller.app.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {



    private List<User> list;


    public UserServiceImpl() {
        this.list = new ArrayList<User>();
        this.list.add(new User(1, "John", "Doe"));

    }



    public List<User> list(){
        return this.list;
    }


    public User getUserById(Integer id){
        User result = null;
        for(User u:this.list){
            if(u.getId().equals(id)){
                result = u;
                break;
            }
        }
        return result;
    }

}
