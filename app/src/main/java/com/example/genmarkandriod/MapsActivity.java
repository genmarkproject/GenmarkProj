package com.example.genmarkandriod;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        // Add a marker in Sydney and move the camera
        LatLng gen0 = new LatLng( 51.85284,  4.30051);
        mMap.addMarker(new MarkerOptions().position(gen0).title("Smith-Holland "));
        LatLng gen1 = new LatLng( 51.88614,  4.42322);
        mMap.addMarker(new MarkerOptions().position(gen1).title("Krone Trailer"));
        LatLng gen2 = new LatLng( 51.87792,  4.45334);
        mMap.addMarker(new MarkerOptions().position(gen2).title("Genmark"));
        LatLng gen4 = new LatLng( 51.30020,  4.83658);
        mMap.addMarker(new MarkerOptions().position(gen4).title("Renders Trailers"));
        LatLng gen5 = new LatLng( 51.09657,  4.61306);
        mMap.addMarker(new MarkerOptions().position(gen5).title("Van Hool"));
        LatLng gen6 = new LatLng( 51.93487,  5.59059);
        mMap.addMarker(new MarkerOptions().position(gen6).title("D-Tec trailer "));
        LatLng gen7 = new LatLng( 50.98108,  3.75733);
        mMap.addMarker(new MarkerOptions().position(gen7).title("Trailer Service Michiels Bvba"));
        LatLng gen8 = new LatLng( 52.52514,  6.42738);
        mMap.addMarker(new MarkerOptions().position(gen8).title("Pacton Trailer"));
        LatLng gen9 = new LatLng( 51.28959,  6.65243);
        mMap.addMarker(new MarkerOptions().position(gen9).title("Tip Trailer Services"));
        LatLng gen11 = new LatLng( 51.49464,  7.26333);
        mMap.addMarker(new MarkerOptions().position(gen11).title("Tip Trailer Services"));
        LatLng gen12 = new LatLng( 51.55780,  7.29295);
        mMap.addMarker(new MarkerOptions().position(gen12).title("Tip Trailer Services"));
        LatLng gen13 = new LatLng( 50.90260,  6.93026);
        mMap.addMarker(new MarkerOptions().position(gen13).title("Tip Trailer Services"));
        LatLng gen14 = new LatLng( 52.85035,  7.64920);
        mMap.addMarker(new MarkerOptions().position(gen14).title("Krone Trailer"));
        LatLng gen15 = new LatLng( 51.81818,  8.32837);
        mMap.addMarker(new MarkerOptions().position(gen15).title("Tip Trailer Services"));
        LatLng gen16 = new LatLng( 49.11269,  6.23292);
        mMap.addMarker(new MarkerOptions().position(gen16).title("Kohler B.E.S."));
        LatLng gen17 = new LatLng( 48.97884,  2.23433);
        mMap.addMarker(new MarkerOptions().position(gen17).title("Kohler B.E.S."));
        LatLng gen18 = new LatLng( 50.80158,  7.60581);
        mMap.addMarker(new MarkerOptions().position(gen18).title("Tip Trailer Services"));
        LatLng gen19 = new LatLng( 52.42007,  9.45467);
        mMap.addMarker(new MarkerOptions().position(gen19).title("Tip Trailer Services"));
        LatLng gen20 = new LatLng( 51.90020,  -1.14048);
        mMap.addMarker(new MarkerOptions().position(gen20).title("E.P. Barrus"));
        LatLng gen21 = new LatLng( 49.94703,  8.83454);
        mMap.addMarker(new MarkerOptions().position(gen21).title("Tip Trailer Services"));
        LatLng gen22 = new LatLng( 49.48577,  0.14973);
        mMap.addMarker(new MarkerOptions().position(gen22).title("Tip Trailer Services"));
        LatLng gen24 = new LatLng( 53.51798,  9.88552);
        mMap.addMarker(new MarkerOptions().position(gen24).title("Tip Trailer Services"));
        LatLng gen25 = new LatLng( 53.51623,  9.97734);
        mMap.addMarker(new MarkerOptions().position(gen25).title("Smith-Germany"));
        LatLng gen26 = new LatLng( 53.78928,  -1.34185);
        mMap.addMarker(new MarkerOptions().position(gen26).title("Krone Trailer"));
        LatLng gen27 = new LatLng( 49.15348,  -0.47153);
        mMap.addMarker(new MarkerOptions().position(gen27).title("Kohler B.E.S."));
        LatLng gen28 = new LatLng( 48.88651,  9.08025);
        mMap.addMarker(new MarkerOptions().position(gen28).title("Tip Trailer Services"));
        LatLng gen30 = new LatLng( 54.07162,  -2.77067);
        mMap.addMarker(new MarkerOptions().position(gen30).title("Dennison Trailers "));
        LatLng gen31 = new LatLng( 51.47288,  12.08577);
        mMap.addMarker(new MarkerOptions().position(gen31).title("Tip Trailer Services"));
        LatLng gen32 = new LatLng( 49.39450,  11.05955);
        mMap.addMarker(new MarkerOptions().position(gen32).title("Tip Trailer Services"));
        LatLng gen33 = new LatLng( 48.08170,  -1.61217);
        mMap.addMarker(new MarkerOptions().position(gen33).title("Kohler B.E.S."));
        LatLng gen34 = new LatLng( 52.37905,  13.32215);
        mMap.addMarker(new MarkerOptions().position(gen34).title("Tip Trailer Services"));
        LatLng gen35 = new LatLng( 48.68898,  2.21329);
        mMap.addMarker(new MarkerOptions().position(gen35).title("Kohler B.E.S."));
        LatLng gen36 = new LatLng( 47.03769,  -0.91972);
        mMap.addMarker(new MarkerOptions().position(gen36).title("Kohler B.E.S."));
        LatLng gen37 = new LatLng( 45.88849,  6.11567);
        mMap.addMarker(new MarkerOptions().position(gen37).title("Kohler B.E.S."));
        LatLng gen38 = new LatLng( 45.79572,  3.12690);
        mMap.addMarker(new MarkerOptions().position(gen38).title("Kohler B.E.S."));
        LatLng gen39 = new LatLng( 45.70034,  5.02029);
        mMap.addMarker(new MarkerOptions().position(gen39).title("Kohler B.E.S."));
        LatLng gen40 = new LatLng( 47.78199,  -3.33281);
        mMap.addMarker(new MarkerOptions().position(gen40).title("Kohler B.E.S."));
        LatLng gen41 = new LatLng( 50.02469,  14.28715);
        mMap.addMarker(new MarkerOptions().position(gen41).title("Hesti Group"));
        LatLng gen42 = new LatLng( 48.42637,  -4.43870);
        mMap.addMarker(new MarkerOptions().position(gen42).title("Kohler B.E.S."));
        LatLng gen44 = new LatLng( 48.20003,  14.15140);
        mMap.addMarker(new MarkerOptions().position(gen44).title("Tip Trailer Services"));
        LatLng gen46 = new LatLng( 43.48904,  5.38262);
        mMap.addMarker(new MarkerOptions().position(gen46).title("Kohler B.E.S."));
        LatLng gen49 = new LatLng( 43.44031,  5.24126);
        mMap.addMarker(new MarkerOptions().position(gen49).title("Tip Trailer Services"));
        LatLng gen50 = new LatLng( 43.56670,  1.48917);
        mMap.addMarker(new MarkerOptions().position(gen50).title("Kohler B.E.S."));
        LatLng gen54 = new LatLng( 47.42427,  19.16451);
        mMap.addMarker(new MarkerOptions().position(gen54).title("Navitruck Kft."));
        LatLng gen55 = new LatLng( 38.89898,  -9.05366);
        mMap.addMarker(new MarkerOptions().position(gen55).title("Alcont Parqueamento E Paparacao de Centores"));
        LatLng gen56 = new LatLng( 65.69920,  -18.12798);
        mMap.addMarker(new MarkerOptions().position(gen56).title("Ekill ehf"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gen1));
    }
}
