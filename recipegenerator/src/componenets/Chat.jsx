import React, { useState } from "react";

function Chat() {
    const [prompt, setPrompt] = useState('');
    const [chatResponse, setChatResponse] = useState('');
    const [isLoading, setIsLoading] = useState(false);

    const askAi = async () => {
        setIsLoading(true);
        setChatResponse(''); // Clear previous response

        try {
            const response = await fetch(`https://recipefy-chefbot.onrender.com/askai?prompt=${prompt}`);
            const data = await response.text();
            console.log(data);
            setChatResponse(data);
        } catch (error) {
            console.error('Error fetching data:', error);
            setChatResponse("Oops! The kitchen is a bit busy. Please try asking again.");
        } finally {
            setIsLoading(false);
        }
    };

    return (
        <div>
            <h1>ChefBot</h1>
            <p style={{ color: '#666', marginTop: '-10px', marginBottom: '20px' }}>Your personal culinary assistant!</p>
            <input 
                type="text" 
                value={prompt} 
                onChange={(e) => setPrompt(e.target.value)} 
                placeholder="Ask about recipes, ingredients, or cooking tips..."
            />
            <button onClick={askAi} className="ask-ai-btn" disabled={isLoading}>
                {isLoading ? 'Thinking...' : 'Ask ChefBot'}
            </button>
            <div className="output">
                <pre className="recipe-text">
                    {isLoading
                        ? "Thinking of a delicious answer... 🧠"
                        : chatResponse
                            ? chatResponse
                            : "I'm ready to help! Ask me anything about cooking."
                    }
                </pre>
            </div>
        </div>
    );
}

export default Chat;
