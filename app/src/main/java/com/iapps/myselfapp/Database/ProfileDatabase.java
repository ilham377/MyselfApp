package com.iapps.myselfapp.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.iapps.myselfapp.Entity.homeProfile;


@Database(entities = {homeProfile.class}, version = 3, exportSchema = false)
public abstract class ProfileDatabase extends RoomDatabase {
    private static ProfileDatabase instance;
    public abstract profileDAO profileDAO();

    private static  RoomDatabase.Callback roomCallback= new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    public static synchronized ProfileDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ProfileDatabase.class, "Profile.db")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    private  static  class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private profileDAO dao;

        private  PopulateDbAsyncTask(ProfileDatabase db){
            dao = db.profileDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            dao.insert(new homeProfile(1, "Bandung, 16 April 2000", "Muhammad Ilham Apriyadi" ,"Jl. Mendut 4, No M35, RT02/RW18, Kel. Melong, Kec. Cimahi Selatan","Laki-laki","A","10118045","Sayur Bayam","Macha","Ghost - Hoshimachi Suisei","Spider-Man","Bermain game, Membaca komik"));


            return null;
        }
    }


}
