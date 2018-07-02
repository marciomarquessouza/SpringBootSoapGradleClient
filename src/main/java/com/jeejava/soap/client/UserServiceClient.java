package com.jeejava.soap.client;

import com.jeejava.userservice.GetUserDetailsRequest;
import com.jeejava.userservice.GetUserDetailsResponse;
import com.jeejava.userservice.User;
import com.jeejava.userservice.UserPort;
import com.jeejava.userservice.UserPortService;

public class UserServiceClient {

    public static void main(String[] args) {
        UserPort userPort = new UserPortService().getUserPortSoap11();
        GetUserDetailsRequest request = new GetUserDetailsRequest();
        request.setName("souvik");
        GetUserDetailsResponse response = userPort.getUserDetails(request);
        for (User user : response.getUsers()) {
            System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", ["
                    + user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", "
                    + user.getAddress().getState() + ", " + user.getAddress().getZip() + ", "
                    + user.getAddress().getCountry() + ", " + user.getAddress().getAddressType() + "]");
        }

        System.out.println("------------------------------------------------------------------------------------------------");

        request.setName("l");
        response = userPort.getUserDetails(request);
        for (User user : response.getUsers()) {
            System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", ["
                    + user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", "
                    + user.getAddress().getState() + ", " + user.getAddress().getZip() + ", "
                    + user.getAddress().getCountry() + ", " + user.getAddress().getAddressType() + "]");
        }
    }
}