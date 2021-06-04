package com.iapps.myselfapp.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.iapps.myselfapp.Entity.homeProfile;

@Dao
public interface profileDAO {

    @Insert
    void insert(homeProfile profile);

    @Query("SELECT * FROM profile where nim = '10118045' ")
    homeProfile getProfile();
}
