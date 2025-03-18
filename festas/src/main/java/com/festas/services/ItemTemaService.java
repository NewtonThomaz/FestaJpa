package com.festas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festas.entities.ItemTema;
import com.festas.repository.ItemTemaRepository;

@Service
public class ItemTemaService {
	private final ItemTemaRepository itemTemaRepository;

	@Autowired
	public ItemTemaService(ItemTemaRepository itemTemaRepository) {
		this.itemTemaRepository = itemTemaRepository;
	}
	
	public ItemTema saveItemTema(ItemTema itemTema) {
		return itemTemaRepository.save(itemTema);
	}
	
	public ItemTema getItemTemaById(Long id) {
		return itemTemaRepository.findById(id).orElse(null);
	}
	
	public List<ItemTema> getAllItensTema(){
		return itemTemaRepository.findAll();
	}
	
	public void deleteItemTema(Long Id) {
		itemTemaRepository.deleteById(Id);
	}
}
