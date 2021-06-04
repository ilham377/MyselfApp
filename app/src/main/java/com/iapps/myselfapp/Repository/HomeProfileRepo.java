package com.iapps.myselfapp.Repository;

import android.app.Application;
import android.os.AsyncTask;

import com.iapps.myselfapp.Database.ProfileDatabase;
import com.iapps.myselfapp.Database.profileDAO;
import com.iapps.myselfapp.Entity.homeProfile;

public class HomeProfileRepo {

    private profileDAO dao;
    private homeProfile profile;

    public HomeProfileRepo(Application application) {
        ProfileDatabase db = ProfileDatabase.getInstance(application);
        dao=db.profileDAO();
        profile= dao.getProfile();
    }

    public void insert (homeProfile pro){
        new InsertProfileAsnycTask(dao).execute(pro);
    }

    public homeProfile getProfile() {
        return profile;
    }

    private  static class  InsertProfileAsnycTask extends AsyncTask<homeProfile,Void,Void> {
        private  profileDAO dao;

        private InsertProfileAsnycTask(profileDAO dao){
            this.dao=dao;
        }

        @Override
        protected Void doInBackground(homeProfile... profiles) {
            dao.insert(profiles[0]);
            //dao.insert(new homeProfile(1, "Bandung, 16 April 2000", "Muhammad Ilham Apriyadi" ,"Jl. Mendut 4, No M35, RT02/RW18, Kel. Melong, Kec. Cimahi Selatan","Laki-laki","A","10118045","Sayur Bayam","Macha","Ghost - Hoshimachi Suisei","Spider-Man","Bermain game, Membaca komik"));
            return null;
        }
    }
}
