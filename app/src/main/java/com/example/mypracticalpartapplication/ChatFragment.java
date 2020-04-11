package com.example.mypracticalpartapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ChatFragment extends Fragment {
    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;

    public ChatFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Taslima Yesmen Orin", "01629399053");
        User user2 = new User("A.S.M Reza Asif", "01619399053");
        User user3 = new User("Nailatun Jahan Nuha", "01729399053");
        User user4 = new User("Nuri All Saba Nuba", "01829390053");
        User user5 = new User("Sumaiya Rahman Sumu", "01629399053");
        User user6 = new User("Nemi", "01629399053");
        User user7 = new User("Sara", "01629399053");
        User user8 = new User("Soma", "01629399053");
        User user9 = new User("Nisa", "01629399053");
        User user10 = new User("Doyel", "01629399053");
        User user11 = new User("Faysal Ahmed", "01629399053");
        User user12 = new User("Dorpon", "01629399053");
        User user13 = new User("Beauty", "01629399053");
        User user14 = new User("Rekha", "01629399053");
        User user15 = new User("Rima", "01629399053");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);
        recyclerView = view.findViewById(R.id.recycler_view);
        customAdapter = new CustomAdapter(users, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(customAdapter);

        return view;
    }
}
