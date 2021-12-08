package com.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.examen.repositories.StockRepository;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;
	@Override
	public void setDateAjout(List<Stock>sts){
		stockRepository.saveAllStocks(sts);
	}

	/*toDo 9*/








}