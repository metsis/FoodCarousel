package com.omen.foodcarousel;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Carousel extends Activity {

	Ingredients ing;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carousel);
		ing = new Ingredients();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.carousel, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	// TODO ideaboard:
	// splash screen - try to figure out what the user would like to have
	// - raffle x number of ingredients, let user remove some if he/she so wishes
	// do a google search on them -> present well rated recipes (3)
	
	public void drawIngredients(View v) {
		
		TextView vegetable, protein, starch, spice;

		vegetable = (TextView) findViewById(R.id.vegetable_field);
		protein = (TextView) findViewById(R.id.protein_field);
		starch = (TextView) findViewById(R.id.starch_field);
		spice = (TextView) findViewById(R.id.spice_field);

		vegetable.setText(ing.getRandom(0));
		protein.setText(ing.getRandom(1));
		starch.setText(ing.getRandom(2));
		spice.setText(ing.getRandom(3));
		
	}

}
