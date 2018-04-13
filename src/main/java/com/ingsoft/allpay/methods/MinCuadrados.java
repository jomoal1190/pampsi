package com.ingsoft.allpay.methods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import org.springframework.stereotype.Service;

@Service
public class MinCuadrados {
	
	public List<List<Object>> LRegresion(List<Double> x , List<Double> y) throws IOException{
		
		 SimpleRegression simpleRegression = new SimpleRegression(true);
		 Map<Double, Double> mapa = new HashMap<Double, Double>();
			List<Object> values = new ArrayList<Object>();
			List<List<Object>> dataList = new ArrayList<List<Object>>();
			
		
		 
		 for(int i=0; i<x.size(); i++) {
				Random ran = new Random();
				int var = ran.nextInt(10);
			 System.out.println(var);
			 simpleRegression.addData(x.get(i)+var,y.get(i)+var);
			 mapa.put(x.get(i)+var, y.get(i)+var); 
			 values = new ArrayList<Object>();
				dataList.add(values);

					values.add(x.get(i)+var);
				
				
				values.add(y.get(i)+var);
		 }
		 
		

     // querying for model parameters
     System.out.println("Pendiente = " + simpleRegression.getSlope());
     System.out.println("Interceptos = " + simpleRegression.getIntercept());
     System.out.println("Tasa de Error = " + simpleRegression.getMeanSquareError());
     System.out.println("Significancia = " + simpleRegression.getSignificance());


     // trying to run model for unknown data
     
     
	 for(int i=0; i<5; i++) { 
		
		 values = new ArrayList<Object>();
			dataList.add(values);

				values.add(x.get(i));
			
			
			values.add(y.get(i));
		 System.out.println("prediction for  = " +simpleRegression.predict(x.size()+i));
	 }
     
    System.out.println(mapa);
return dataList;
 }


}
