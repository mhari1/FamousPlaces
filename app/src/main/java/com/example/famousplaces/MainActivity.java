package com.example.famousplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView famousPlaces;

    public static ArrayList<FamousPlacesArray> show_places = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        famousPlaces = (ListView) findViewById(R.id.famousPlaces);

        show_places.add(new FamousPlacesArray("Mont Royal", "Mont-Royal rises 233 meters above the city and is the green lung near the city center. A stroll through this lovely park enables the visitor to see monuments to Jacques Cartier and King George VI, to spend some time by Lac-aux-Castors, and to have a look at the cemeteries on the western slope where the city's different ethnic groups have rested in peace together for centuries.", 45.516109,-73.643059, R.drawable.mount_royal));
        show_places.add(new FamousPlacesArray("Vieux Montreal", "Old Montréal is a remarkable concentration of buildings dating from the 17th, 18th, and 19th centuries. The district has the delightful feel of a Parisian-style quarter, situated as it is between the waterfront and the business hub. Its many historic sites, streets, and landmarks are best explored on foot.",  45.516136,-73.656830, R.drawable.vieux_montreal));
        show_places.add(new FamousPlacesArray("Jardin Botanique", "High above the city in the grounds that hosted the 1976 Summer Olympic Games, Parc Maisonneuve (Pie IX Metro) is the site of Montreal's wonderfully imaginative botanical garden. The diverse plants are grown in 30 themed gardens and 10 exhibition greenhouses, so a wide range of climates are represented.", 45.554331116 ,-73.554081117, R.drawable.botanical_garden));
        show_places.add(new FamousPlacesArray("Notre-Dame Basilica", "Founded in 1656, Montréal's oldest church, Notre-Dame Basilica, stands in a far grander incarnation than the original. The twin towers of the neo-Gothic façade face Place d'Armes. The intricate and resplendent interior was designed by Victor Bourgeau.", 45.5027, -73.5538, R.drawable.norte_dame));
        show_places.add(new FamousPlacesArray("Parc Jean Drapeau", "Île Sainte-Hélène (named after the wife of Samuel de Champlain) and the artificial island of Notre-Dame were the site of Expo '67. They are now known as Parc Jean Drapeau and have many family-minded attractions. A remnant of the 1967 world fair, the Biosphere is now a museum dedicated to ecological issues.", 45.517066,-73.533580, R.drawable.parc_jean_drapeau));
        show_places.add(new FamousPlacesArray("Pointe-à-Callière", "At one corner of Place Royale in Vieux-Montréal is the Pointe-à-Callière, now marked by a striking modern building housing a museum of archaeology and history. Place Royale was the center of life in Montréal's early and colonial days, where the market and parade ground were located until later government buildings displaced them.", 45.480270,-73.793137, R.drawable.pointe_a_calliere));
        show_places.add(new FamousPlacesArray("Place des Arts", "The Place des Arts is an entire complex dedicated to visual and performing arts, the largest of its kind in all Canada. Three great cultural organizations make their home here: the Montreal Symphony Orchestra, Les Grands Ballets Canadiens, and the Opéra de Montréal, and its various stages and rehearsal halls provide venues for all kinds of theater, music, dance, films, and events. ", 45.5083,73.5664, R.drawable.place_des_arts));
        show_places.add(new FamousPlacesArray("Mary Queen", "The Catholic Mary Queen of the World Cathedral, east of Place du Canada, was built in 1894 as a smaller version of St. Peter's in Rome. The massive statues represent the patron saints of the 13 parishes of Montreal in the 19th century and were all sculpted by Olindo Gratton between 1892 and 1898. ", 45.4992,73.5682, R.drawable.mary_queen));
        show_places.add(new FamousPlacesArray("McCord Museum", "The McCord Museum has an outstanding collection of exhibits on Canada's social history, especially native peoples. Its collections of costumes, clothing, accessories, quilts, and other hand-made textiles total more than 20,000 objects and include works by Montreal fashion designers. ", 45.5043,73.5734, R.drawable.mccord_museum));
        show_places.add(new FamousPlacesArray("Lachine Canal", "Lachine, on the southeast bank of Montréal Island (in Lac St.-Louis), got its name from the first pioneers who, in the 17th century, made their way up the St. Lawrence looking for a route to China (in French, \"la Chine\"). The 14.4-kilometer Lachine Canal, a way of getting around the Lachine Rapids, was dug in 1825.", 45.4310,73.6704, R.drawable.lachine_canel));

        PlacesAdapter pAdapter = new PlacesAdapter(show_places, getApplicationContext());
        famousPlaces.setAdapter(pAdapter);

    }
}
