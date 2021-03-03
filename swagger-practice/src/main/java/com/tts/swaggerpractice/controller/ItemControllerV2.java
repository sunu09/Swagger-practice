package com.tts.swaggerpractice.controller;

import com.tts.swaggerpractice.model.itemV1;
import com.tts.swaggerpractice.model.itemV2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/v2")
@Api(value="menuItems", description = "Operations pertaining to menu items")
@RestController
    public class ItemControllerV2 {

        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Successfully retrieved menu item"),
                @ApiResponse(code = 4-1, message = "You are not authorized to view the menu item")
        })

        @ApiOperation(value = "Get all menu items", response = itemV1.class,
                responseContainer = "List")
        @GetMapping("/item/all")
        public ResponseEntity<List<itemV2>> getAllItems() {
            return new ResponseEntity(new ArrayList<itemV2>(), HttpStatus.OK);
        }

    }

