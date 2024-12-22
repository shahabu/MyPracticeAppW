package com.example.myapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapp.MainActivity;
import com.example.myapp.NearestVehicle;
import com.example.myapp.R;
import com.example.myapp.TransferCar;
import com.example.myapp.TransferGoods;
import com.example.myapp.TransferMotorbike;
import com.example.myapp.WebActivity;
import com.example.myapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//        return root;

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CardView carTransfer = view.findViewById(R.id.carTransfer);
        CardView nearestVehicle = view.findViewById(R.id.nearestVehicle);
        CardView moterbike = view.findViewById(R.id.moterbike);
        CardView transferGoods = view.findViewById(R.id.transferGoods);
        CardView dashboard = view.findViewById(R.id.dashboard_card);

        carTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TransferCar.class);
                startActivity(intent);
            }
        });

        nearestVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NearestVehicle.class);
                startActivity(intent);
            }
        });

        moterbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TransferMotorbike.class);
                startActivity(intent);
            }
        });

        transferGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TransferGoods.class);
                startActivity(intent);
            }
        });

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}