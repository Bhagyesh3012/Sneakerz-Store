import React from "react";
import HomeCarousel from "../customer/Components/Carousel/HomeCarousel";
import { homeCarouselData } from "../customer/Components/Carousel/HomeCaroselData";
import HomeProductSection from "../customer/Components/Home/HomeProductSection";

 import { mensShoesPage1 } from "../Data/shoes";


const Homepage = () => {

  return (
    <div className="">
      <HomeCarousel images={homeCarouselData} />

      <div className="space-y-10 py-20">
      
        <HomeProductSection data={mensShoesPage1} section={"Men's Shoes"} />
       
      </div>

      
    </div>
  );
};

export default Homepage;
