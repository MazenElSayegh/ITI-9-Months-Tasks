// Using OLOO

const Person = {
    constructor(fullName, money,sleepMood,healthRate)
    {
        this.fullName = fullName;
        this.money=money;
        this.sleepMood=sleepMood;
        this.healthRate=healthRate;
        return this;
    },
    sleep (hours)
    {
        if(hours<7)
        {
            this.sleepMood="tired";
            console.log(this.sleepMood);
        }
        else if(hours>7)
        {
            this.sleepMood="lazy";
            console.log(this.sleepMood);
        }
        else
        {
            this.sleepMood="happy";
            console.log(this.sleepMood);
        } 
      },
    eat (meals)
    {
        switch(meals)
        {
            case 3:
                console.log(`${this.healthRate} health rate`);
                break;
            case 2:
                this.healthRate*=0.75;
                console.log(`${this.healthRate} health rate`);
                break;
            case 1:
                this.healthRate*=0.5;
                console.log(`${this.healthRate} health rate`);
                break;
            default:
                console.log("Unhealthy");
        }
    },
    buy (items)
        {
            if(this.money>=10*items)
            {
                this.money-=10*items;
                console.log(`You have ${this.money} L.E. left`);  
            }
            else
            console.log("Not enough money");  
        }
  }
  
  
  const Mazen=Object.create(Person).constructor(`Mazen Mohamed`,100,`tired`,100);
  Mazen.eat(2);
  Mazen.buy(6);
  Mazen.sleep(8);
  Mazen.eat(3);
  Mazen.buy(5);