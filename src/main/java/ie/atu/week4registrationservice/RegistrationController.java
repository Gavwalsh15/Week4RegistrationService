package ie.atu.week4registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final NotificationServiceClient notificationServiceClient;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient){
        this.notificationServiceClient = notificationServiceClient;
    }
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        //this really does nothing
        String confirmationMessage = "Hello," + userDetails; //notificationServiceClient.notifyUser(userDetails);
        return  confirmationMessage;
    }
}
