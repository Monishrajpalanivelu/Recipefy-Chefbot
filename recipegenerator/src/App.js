import { useState } from 'react';
import './App.css';
import RecipeGenerator from './componenets/Recipe generator';
import Chat from './componenets/Chat';

function App() {
  const[activeTab, setActiveTab] = useState('Generate Recipe');

  const handleTanChange = (tab) => {
    //alert(tab);
    setActiveTab(tab);
  }
  return (
    <div className="App">
     <button className={activeTab === 'Generate Recipe' ? 'active' : ''}
     onClick={() => handleTanChange ('Generate Recipe') }>CuisineCrafter</button>
     <button  className={activeTab === 'ChatBot' ? 'active' : ''}

     onClick={() => handleTanChange ('ChatBot')}> AskTheChef </button>
     <div>
      {activeTab === 'Generate Recipe' && <RecipeGenerator />}
      {activeTab === 'ChatBot' && <Chat />}
     </div>
    </div>
  );
}

export default App;
