import React, { useState } from "react";

function RecipeGenerator() {
    const [ingredients, setIngredients] = useState('');
    const [recipe, setRecipe] = useState('');
    const [dietaryrestrictions, setDietaryRestrictions] = useState('');
    const [cuisine, setCuisine] = useState('');
    // New state to track the loading process
    const [isLoading, setIsLoading] = useState(false);

    const createRecipe = async () => {
        // 1. Set loading to true right away
        setIsLoading(true);
        setRecipe(''); // Clear the previous recipe

        try {
            const response = await fetch(`http://localhost:8080/recipecreator?ingredients=${ingredients}&dietaryrestrictions=${dietaryrestrictions}&cuisine=${cuisine}`);
            const data = await response.text();
            console.log(data);
            setRecipe(data);
        } catch (error) {
            console.error('Error fetching data:', error);
            setRecipe("Sorry, something went wrong. Please try again!"); // Show an error message
        } finally {
            // 3. Set loading back to false when done (whether it succeeded or failed)
            setIsLoading(false);
        }
    };

    return (
        <div>
            <h1>Recipefy</h1>
            <input type="text" value={ingredients} onChange={(e) => setIngredients(e.target.value)} placeholder="Enter Ingredients (comma-separated)" />
            <input type="text" value={dietaryrestrictions} onChange={(e) => setDietaryRestrictions(e.target.value)} placeholder="Enter Dietary Restrictions" />
            <input type="text" value={cuisine} onChange={(e) => setCuisine(e.target.value)} placeholder="Enter Cuisine (optional)" />

            {/* The button is now disabled and changes text while loading */}
            <button onClick={createRecipe} className="create-recipe-btn" disabled={isLoading}>
                {isLoading ? 'Whipping it up...' : 'Create Recipe'}
            </button>

            <div className="output">
                <pre className="recipe-text">
                    {/* 2. Conditionally render one of three messages */}
                    {isLoading
                        ? "Whipping up something delicious for you... 🧑‍🍳"
                        : recipe
                            ? recipe
                            : "Your generated recipe will appear here! ✨\nEnter your ingredients and click 'Create Recipe' to begin."
                    }
                </pre>
            </div>
        </div>
    );
}

export default RecipeGenerator;
