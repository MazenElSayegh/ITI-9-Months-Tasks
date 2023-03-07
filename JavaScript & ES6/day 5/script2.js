class Person  {
    #fullName;
    #money;
    #sleepMood;
    #healthRate;
    get fullName () 
    {
        return this.#fullName;
    }
    set fullName (value) 
    {
        this.#fullName = value;
    }
    get money () 
    {
        return this.#money;
    }
    set money (value) 
    {
        this.#money = value;
    }
    get sleepMood () 
    {
        return this.#sleepMood;
    }
    set sleepMood (value) 
    {
        this.#sleepMood = value;
    }
    get healthRate () 
    {
        return this.#healthRate;
    }
    set healthRate (value) 
    {
        this.#healthRate = value;
        if (value < 0) this.#healthRate = 0;
        else if(value>100) this.#healthRate=100;
    }
    
    constructor()
    {
        this.fullName = "";
        this.money=10;
        this.sleepMood="tired";
        this.healthRate=50;
    }
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
      }
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
    }
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
class Employee extends Person
    {
     #salary;
     #id;
     #email;
     #workMood;
     #isManager;

    get salary () 
    {
        return this.#salary;
    }

    set salary (value) 
    {
        this.#salary = value;
        if (value <= 1000) this.#salary = 1000;
    }
    get id () 
    {
        return this.#id;
    }

    set id (value) 
    {
        this.#id = value;
    }
    get email () 
    {
        return this.#email;
    }

    set email (value) 
    {
        this.#email = value;
    }
    get workMood () 
    {
        return this.#workMood;
    }

    set workMood (value) 
    {
        this.#workMood = value;
    }
    get isManager () 
    {
        return this.#isManager;
    }

    set isManager (value) 
    {
        this.#isManager = value;
    }
    constructor ()
    {
        super();
        this.#id=1
        this.#email=""
        this.#workMood="tired"
        this.#salary=1000
        this.#isManager=false
    }
    work (hours)
    {
        if(hours>8)
        {
            this.workMood="tired";
            console.log(this.workMood);
        }
        else if(hours<8)
        {
            this.workMood="lazy";
            console.log(this.workMood);
        }
        else
        {
            this.workMood="happy";
            console.log(this.workMood);
        }   
    }
}
class Office
{
    #name;
    #employees=[];
    get name()
    {
        return this.#name;
    }
    set name(value)
    {
        this.#name=value;
    }
    getAllEmployees ()
    {
        return this.#employees;
    }
    getEmployee (empId)
    {
        let chosenEmployee;
        for(let i=0;i<this.#employees.length;i++)
        {
            if(this.#employees[i].id==empId)
            {
                chosenEmployee=this.#employees[i];
                break;
            }
        }
        
        return chosenEmployee;
    }
    hire (Employee) 
    {
        this.#employees.push(Employee);
    }
    fire (empId)
    {
        let firedEmp;
        for(let i=0;i<this.#employees.length;i++)
        {
            if(this.#employees[i].id==empId)
            {
                firedEmp=this.#employees[i].fullName;
                this.#employees.splice(i, 1);
                alert("You fired "+firedEmp);
            }
        }
    }
    constructor(name)
    {
        this.#name=name;
    }
}

var officeName=prompt("Enter the name of the office");
var office= new Office(officeName);
var funct=prompt("Enter function: hire , fire, getemp, getallemp");
while(funct!=null)
{   
    switch(funct)
    {
        case "hire":
        {
            let emp= new Employee();
            let name=prompt("Enter fullname");
            emp.fullName=name;
            let iD=prompt("Enter id");
            emp.id=iD;
            let eMail=prompt("Enter email");
            emp.email=eMail;
            let saLary=prompt("Enter salary");
            emp.salary=saLary;
            let mood=prompt("Enter work mood");
            emp.workMood=mood;
            let hRate=prompt("Enter health rate");
            emp.healthRate=hRate;
            let check=prompt("Manager or Normal employee");
            if (check=="Manager") emp.isManager=true;
            else emp.isManager=false;
            office.hire(emp);
            break;        
        }
        case "fire":
        {
            let empId=prompt("Enter id of employee you want to fire");
            office.fire(empId);
            break;
        }
        case "getemp":
        {
            let empId=prompt("Enter id of employee");
            let tempEmp=office.getEmployee(empId);
            alert(`
                Name: ${tempEmp.fullName}
                ID: ${tempEmp.id}
                Salary: ${tempEmp.salary}
                Work Mood: ${tempEmp.workMood}
                Email: ${tempEmp.email}
                Health Rate: ${tempEmp.healthRate}
                Manager: ${tempEmp.isManager}`
            );
            break;
        }
        case "getallemp":
        {
            let myArray=[];
            for(let i=0;i<office.getAllEmployees().length;i++)
            {
                let myString = `
                Name: ${office.getAllEmployees()[i].fullName}
                ID: ${office.getAllEmployees()[i].id}
                Salary: ${office.getAllEmployees()[i].salary}
                Work Mood: ${office.getAllEmployees()[i].workMood}
                Email: ${office.getAllEmployees()[i].email}
                Health Rate: ${office.getAllEmployees()[i].healthRate}
                Manager: ${office.getAllEmployees()[i].isManager}`;
                myArray.push(myString);
            }                       
            alert("Employees: \n" +myArray.join("\n"));
            break;
        }
    }
var funct=prompt("Enter function: hire , fire, getemp, getallemp");
}


//TRY CODE

// const alex= new Office("alex");
// const ahmed=new Employee();
// const mohamed=new Employee();
// ahmed.id=1;
// mohamed.id=2;
// alex.hire(ahmed);
// alex.hire(mohamed);
// alex.getEmployee(2);
// console.log(alex.getAllEmployees());
//alex.fire(2);
// const Mazen=new Employee();
// Mazen.salary=100;
// console.log(Mazen.salary);
// console.log(Mazen);
