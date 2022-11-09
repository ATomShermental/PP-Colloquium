package com.example.ppcolloquium;

import com.example.ppcolloquium.model.StringConcatenationStructure;
import com.example.ppcolloquium.model.StringRepeaterStructure;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("string")
@AllArgsConstructor
public class StringController {
    private final StringService stringService;
    @PostMapping("concatenation")
    public String stringConcatenation(@RequestBody StringConcatenationStructure stringConcatenationStructure){
        return stringService.stringConcatenation(stringConcatenationStructure.getString1(), stringConcatenationStructure.getString2());
    }

    @PostMapping("repeate")
    public String stringRepeater(@RequestBody StringRepeaterStructure stringRepeaterStructure){
        return stringService.stringRepater(stringRepeaterStructure.getString(), stringRepeaterStructure.getNumber());
    }


}
