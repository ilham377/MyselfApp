package com.iapps.myselfapp.viewModel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.iapps.myselfapp.Database.profileDAO;
import com.iapps.myselfapp.Entity.homeProfile;
import com.iapps.myselfapp.Repository.HomeProfileRepo;

public class profileVM extends AndroidViewModel {
    private HomeProfileRepo repo;
    public profileDAO dao ;
    private homeProfile profile;

    public profileVM(@NonNull Application application) {
        super(application);
        repo = new HomeProfileRepo(application);
        profile = repo.getProfile();
    }
    public  void  insert (homeProfile dat){
        repo.insert(dat);
        Log.d("test", "insert: " +dat);
    }
    public  homeProfile getProfile(){
        return profile;
    }
}
