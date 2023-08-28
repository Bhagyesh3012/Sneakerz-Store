package com.sneakerz_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerz_store.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
