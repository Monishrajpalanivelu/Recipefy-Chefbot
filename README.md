🍳 Recipefy-Chefbot AI

Welcome to Recipefy-Chefbot, an intelligent culinary assistant that inspires your next meal!
This full-stack application generates unique recipes from the ingredients you provide and answers your cooking questions with a conversational AI chef.

🚀 Live Demo

Frontend (React App): https://chimerical-wisp-0e018b.netlify.app/

Backend (Spring Boot API): https://recipefy-chefbot.onrender.com/

⚠️ Note: The backend is hosted on a free tier, so the first request may take a few seconds to “wake up” the server.

✨ Features
1. Recipe Generator

🥗 Ingredient-Based Creation → Enter a list of comma-separated ingredients.

🌱 Dietary Customization → Support for restrictions (e.g., vegetarian, gluten-free).

🍝 Cuisine Specification → Request specific cuisines (e.g., Italian, Mexican).

2. ChefBot Assistant/General Purpose

💬 Conversational AI → Ask any cooking-related question.

👨‍🍳 Expert Knowledge → Cooking techniques, ingredient substitutions, pairings.

🎉 Creative Inspiration → Meal ideas for special occasions.

🛠️ Tech Stack & Architecture
Frontend

⚛️ React (SPA)

🎨 CSS (responsive & dynamic styling)

🌍 Deployed on Netlify

Backend

☕ Java & Spring Boot (REST API)

📦 Docker containerized

🌍 Deployed on Render

Artificial Intelligence

🤖 Large Language Model (LLM) via REST API

🧠 Tasks: Natural Language Understanding (NLU) & Text Generation

Follow these steps to run Recipefy-Chefbot locally:

1. Clone the Repository
git clone https://github.com/Monishrajpalanivelu/Recipefy-Chefbot.git
cd Recipefy-Chefbot

2. Setup the Backend (Spring Boot API)
cd backend
./mvnw spring-boot:run


The backend should now be running at http://localhost:8080

3. Setup the Frontend (React App)
cd frontend
npm install
npm start


The frontend should now be running at http://localhost:3000

4. Environment Variables

Create a .env file inside the frontend and backend directories. Example:

Frontend (frontend/.env)
REACT_APP_API_URL=http://localhost:8080

Backend (backend/.env)
AI_API_KEY=your_ai_api_key_here

🧑‍🍳 Usage
Generate Recipes

Open http://localhost:3000

Navigate to the Recipe Generator tab

Enter ingredients, dietary needs, or desired cuisine

Click Create Recipe

Chat with ChefBot

Go to the ChatBot tab

Ask any cooking-related question

Get instant expert advice!

📦 Deployment

Frontend → Deployed on Netlify

Backend → Deployed on Render

Docker used for containerization
