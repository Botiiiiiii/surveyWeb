// src/main/frontend/src/App.js

import React, { useEffect, useState } from 'react';
import axios from 'axios';
import Intro from './page/intro.js';
import Example from './page/example.js';
import Agreement from './page/agreement.js';
import { Routes, Route, BrowserRouter } from "react-router-dom";

function App() {

    return (
        <BrowserRouter>
        <Routes>
          {/* 웹 서비스 소개 페이지 */}
          <Route path="/" element={<Example />} />
//          <Route path="/" element={<Intro />} />
          {/* 약관 동의 */}
          <Route path="/agreement" element={<Agreement />} />
        
        </Routes>
      </BrowserRouter> 
    );
}

export default App;