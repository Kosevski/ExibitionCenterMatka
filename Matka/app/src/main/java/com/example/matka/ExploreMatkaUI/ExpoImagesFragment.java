package com.example.matka.ExploreMatkaUI;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.matka.R;

import java.util.ArrayList;


public class ExpoImagesFragment extends Fragment {

    ArrayList<img_model> img_models = new ArrayList<>();

    public ExpoImagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_expo_images_fragment, container, false);

        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(getFragmentManager());
                getFragmentManager().beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();
            }
        });


        img_models.add(new img_model(R.drawable.citati_na_naucnici_cetiri));
        img_models.add(new img_model(R.drawable.citati_na_naucnici_dva));
        img_models.add(new img_model(R.drawable.citati_na_naucnici_eden));
        img_models.add(new img_model(R.drawable.citati_na_naucnici_tri));
        img_models.add(new img_model(R.drawable.citati_na_naucnici_pet));
        img_models.add(new img_model(R.drawable.dispacerska_tabla_od_sedumdesetite_cetiri));
        img_models.add(new img_model(R.drawable.dispacerska_tabla_od_sedumdesetite_dva));
        img_models.add(new img_model(R.drawable.dispacerska_tabla_od_sedumdesetite_eden));
        img_models.add(new img_model(R.drawable.dispacerska_tabla_od_sedumdesetite_tri));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_cetiri));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_deset));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_devet));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_dvanaeset));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_eden));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_edinaeset));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_osum));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_pet));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_sedum));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_sest));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_tri));
        img_models.add(new img_model(R.drawable.eliktrifikacija_na_makedonija_trinaeset));
        img_models.add(new img_model(R.drawable.kontrolna_soba_dva));
        img_models.add(new img_model(R.drawable.kontrolna_soba_eden));
        img_models.add(new img_model(R.drawable.kontrolna_soba_osum));
        img_models.add(new img_model(R.drawable.kontrolna_soba_pet));
        img_models.add(new img_model(R.drawable.kontrolna_soba_sedum));
        img_models.add(new img_model(R.drawable.kontrolna_soba_sest));
        img_models.add(new img_model(R.drawable.kontrolna_soba_tri));
        img_models.add(new img_model(R.drawable.kontrolna_soba_odnadvor));
        img_models.add(new img_model(R.drawable.kontrolna_soba_odnadvor_kukla));
        img_models.add(new img_model(R.drawable.masinska_sala_eden));
        img_models.add(new img_model(R.drawable.masinska_sala_dva));
        img_models.add(new img_model(R.drawable.masinska_sala_tri));
        img_models.add(new img_model(R.drawable.masinska_sala_pet));
        img_models.add(new img_model(R.drawable.masinska_sala_sedum));
        img_models.add(new img_model(R.drawable.masinska_sala_sest));
        img_models.add(new img_model(R.drawable.masinska_sala_devet));
        img_models.add(new img_model(R.drawable.originalen_alat_cetir));
        img_models.add(new img_model(R.drawable.originalen_alat_dva));
        img_models.add(new img_model(R.drawable.originalen_alat_eden));
        img_models.add(new img_model(R.drawable.originalen_alat_tri));
        img_models.add(new img_model(R.drawable.plazma_paneli_dva));
        img_models.add(new img_model(R.drawable.plazma_paneli_eden));
        img_models.add(new img_model(R.drawable.plazma_paneli_tri));
        img_models.add(new img_model(R.drawable.plazma_topka_eden));
        img_models.add(new img_model(R.drawable.plazma_topka_dva));
        img_models.add(new img_model(R.drawable.plazma_topka_tri));
        img_models.add(new img_model(R.drawable.plazma_topka_cetiri));
        img_models.add(new img_model(R.drawable.rotiracka_sirena_eden));
        img_models.add(new img_model(R.drawable.rotiracka_sirena_tri));
        img_models.add(new img_model(R.drawable.rotiracka_sirena_dva));
        img_models.add(new img_model(R.drawable.rotiracka_sirena_cetiri));
        img_models.add(new img_model(R.drawable.stabilizator_na_napon_za_star_tv_ured_dva));
        img_models.add(new img_model(R.drawable.stabilizator_na_napon_za_star_tv_ured_eden));
        img_models.add(new img_model(R.drawable.stabilizator_na_napon_za_star_tv_ured_pet));
        img_models.add(new img_model(R.drawable.stabilizator_na_napon_za_star_tv_ured_tri));
        img_models.add(new img_model(R.drawable.telefonski_ured_na_navivanje_dva));
        img_models.add(new img_model(R.drawable.telefonski_ured_na_navivanje_eden));
        img_models.add(new img_model(R.drawable.telefonski_ured_na_navivanje_tri));
        img_models.add(new img_model(R.drawable.test_elektrifikacija_na_mk));
        img_models.add(new img_model(R.drawable.test_elektrifikacija_na_mk_dva));
        img_models.add(new img_model(R.drawable.transformatori_dva));
        img_models.add(new img_model(R.drawable.transformatori_eden));
        img_models.add(new img_model(R.drawable.transformatori_tri));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_cetiri));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_dva));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_tri));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_pet));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_sest));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_sedum));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_osum));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_devet));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_deset));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_edinaeset));
        img_models.add(new img_model(R.drawable.upotreba_na_elektricnata_energija_vo_svetot_eden));

        RecyclerView rv = rootView.findViewById(R.id.expoRV);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        ExpoImagesAdapter adapter = new ExpoImagesAdapter(img_models);
        rv.setAdapter(adapter);


        return rootView;


    }

}
