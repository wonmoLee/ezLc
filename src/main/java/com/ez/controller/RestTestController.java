package com.ez.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ez.domain.RestaurantVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/api")
public class RestTestController {

    @GetMapping("")
    public String callApiWithJson(Model model) {
        StringBuffer result = new StringBuffer();
        try {
            String apiUrl = "http://apis.data.go.kr/6260000/FoodService/getFoodKr?" +
                    		"serviceKey=NpWoK%2B9TXI2ANBiLmAIG1KE0t8YevjqBYbvwmUc1btYTqfeRmnuhE7QJQOYaY3zdHsmbb%2BMVw03q2adzmFp1Tw%3D%3D" +
                    		"&numOfRows=10" +
                    		"&pageNo=4" +
                    		"&resultType=json";
            URL url = new URL(apiUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
            String returnLine;
            while((returnLine = bufferedReader.readLine()) != null) {
                result.append(returnLine);
            }
            bufferedInputStream.close();
            urlConnection.disconnect();

            Gson gson = new Gson();
            ObjectMapper mapper = new ObjectMapper();
            JsonObject ob = gson.fromJson(result.toString(), JsonObject.class);
            JsonArray jsonData = ob.get("getFoodKr").getAsJsonObject().getAsJsonArray("item");
            RestaurantVO restaurantVO = null;
            ArrayList<RestaurantVO> restaurantVOList = new ArrayList<>();
            
			for (int i = 0; i < jsonData.size(); i++) {
				System.out.println(jsonData.get(i).getAsJsonObject().toString());
				restaurantVO = gson.fromJson(jsonData.get(i).getAsJsonObject().toString(), RestaurantVO.class);
				System.out.println(restaurantVO);
				restaurantVOList.add(restaurantVO);
			}
			System.out.println(restaurantVOList);
			model.addAttribute("data", restaurantVOList);
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
