package com.example.ppcolloquium;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StringService {


    public String stringConcatenation(String string1, String string2) {
        if(string1.equals("") && string2.equals("")){
            return "The string is empty";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(string1);
            sb.append(string2);
            return sb.toString();
        }
    }

    public String stringRepater(String string, int number) {
        if(number == 0){
            return "The string is empty";
        } else {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < number; i++){
                sb.append(string);
            }
            return sb.toString();
        }
    }
}
