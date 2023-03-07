// Factory funtion

function Person (fullName, money,sleepMood,healthRate) {
    return {
        fullName,
        money,
        sleepMood,
        healthRate,
        sleep (hours)  
        {
        if(hours<7)
        {
            sleepMood="tired";
            console.log(sleepMood);
        }
        else if(hours>7)
        {
            sleepMood="lazy";
            console.log(sleepMood);
        }
        else
        {
            sleepMood="happy";
            console.log(sleepMood);
        } 
      },
    eat (meals)
    {
        switch(meals)
        {
            case 3:
                console.log(`${healthRate} health rate`);
                break;
            case 2:
                healthRate*=0.75;
                console.log(`${healthRate} health rate`);
                break;
            case 1:
                healthRate*=0.5;
                console.log(`${healthRate} health rate`);
                break;
            default:
                console.log("Unhealthy");
        }
    },
    buy (items)
        {
            if(money>=10*items)
            {
                money-=10*items;
                console.log(`You have ${money} L.E. left`);  
            }
            else
            console.log("Not enough money");  
        }
    }
}
  
  
  const Mazen= Person(`Mazen Mohamed`,100,`tired`,100);
  Mazen.eat(2);
  Mazen.buy(6);
  Mazen.sleep(8);
  Mazen.eat(3);
  Mazen.buy(5);