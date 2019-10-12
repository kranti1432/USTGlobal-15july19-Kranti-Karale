import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.css']
})
export class RecipeComponent implements OnInit {

  recipedata:any='';
 recipes= [{ name:'Gulab Jamun',
  img:'https://cdn.pixabay.com/photo/2014/06/18/15/48/indian-sweet-371357__340.jpg',
  discription:'In a large bowl, stir together the milk powder, flour, baking powder, and cardamom. Stir in the almonds, pistachios and golden raisins. Mix in the melted ghee, then pour in the milk, and continue to mix until well blended. Cover and let rest for 20 minutes.In a large skillet, stir together the sugar, water, rose water and a pinch of cardamom. Bring to a boil, and simmer for just a minute. Set aside.Fill a large heavy skillet halfway with oil. Heat over medium heat for at least 5 minutes. Knead the dough, and form into about 20 small balls. Reduce the heat of the oil to low, and fry the balls in one or two batches. After about 5 minutes, they will start to float, and expand to twice their original size, but the color will not change much. After the jamun float, increase the heat to medium, and turn them frequently until light golden. Remove from the oil to paper towels using a slotted spoon, and allow to cool. Drain on paper towels and allow to cool slightly.Place the balls into the skillet with the syrup. Simmer over medium heat for about 5 minutes, squeezing them gently to soak up the syrup. Serve immediately, or chill.'
  },
  { name:'Pizza',
  img:'https://cdn.pixabay.com/photo/2014/05/18/11/25/pizza-346985__340.jpg',
  discription:'Preheat your ovens broiler. If you have a pizza stone, place it in the oven while it preheats.In a food processor, combine the avocados and cilantro. Puree while adding lime juice and salt to taste. Cover, and see the garlic clove in half, and rub the cut side onto the tops of the pizza crusts for flavor. Brush both sides of the crusts with olive oil. Spread the avocado mixture thickly over the top of each crust, then arrange chicken and tomatoes on top. Sprinkle with cheese, and season lightly with cayenne pepper. Place pizzas on a baking sheet if you do not have a pizza stone.Broil for about 5 minutes in the preheated oven, or until the cheese has just melted and the crust is lightly toasted.'
  },
  { name:'Burger',
  img:'https://image.shutterstock.com/image-photo/fresh-tasty-burger-french-fries-260nw-334280807.jpg',
  discription:'Preheat grill for high heat.In a large bowl mix together the onion, beef, and salt and pepper to taste. Form into patties.Lightly oil grate, and place burgers on grill. Cook for 3 to 5 minutes per side. Remove from grill, and serve with your favorite condiments.'
  },
  { name:'Paneer tikka',
  img:'https://image.shutterstock.com/image-photo/famous-indian-food-recipepaneer-butter-260nw-529460374.jpg',
  discription:'Heat 1 tablespoon oil in a large skillet over medium heat. Place mixed nuts in the skillet, cook and stir until golden brown, and set aside. Stir onion into the skillet, and cook until tender. Mix in garlic paste and ginger paste, and cook 1 minute. Stir in tomato sauce, cayenne pepper, turmeric, coriander, and garam masala. Pour in water, and mix in raisins, carrots, green bell pepper, beans, peas, and potatoes. Bring to a boil. Reduce heat to low, and simmer 20 minutes, until potatoes are tender. Heat remaining oil in a separate skillet over medium-high heat, and cook the paneer on both sides, until golden brown. Drain on paper towels. Place in a bowl with enough hot water to cover for about 2 minutes to soften, then stir into the skillet with the vegetables.Stir milk and cream into the skillet with the vegetables and paneer. Bring to a boil, and continue cooking 2 to 3 minutes. Season with salt to taste.'
  },
  { name:'cake',
  img:'https://cdn.pixabay.com/photo/2014/10/13/16/11/cake-486874__340.jpg',
  discription:'Preheat oven to 400 degrees F (200 degrees C).Mix the graham cracker crumbs, 1/2 cup of the white sugar, and the melted butter together. Press mixture into the bottom of one 9 or 10 inch springform pan.In a large bowl, combine cream cheese, eggs and egg yolks; mix until smooth. Add the remaining 1 3/4 cups white sugar, the flour and the heavy cream. Blend until smooth. Pour batter into prepared pan. Bake at 400 degrees F (200 degrees C) for 10 minutes, then turn oven temperature down to 200 degrees F (100 degrees C) and continue baking for 1 hour, or until filling is set. Let cheesecake cool, then refrigerate.'
  }
];
  constructor() { }
sendrecipe(recipe){
  this.recipedata=recipe;
}
  ngOnInit() {
  }

}
