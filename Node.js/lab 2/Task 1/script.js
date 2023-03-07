class myClass {
  tickets = [];
  addTicket(seatNum, flightNum, departure, arrival, travDate, flightID) {
    let ticket = { seatNum, flightNum, departure, arrival, travDate, flightID };
    this.tickets.push(ticket);
  }
  displayTickets() {
    return this.tickets;
  }
  getTicket(id) {
    let current;
    for (let i = 0; i < this.tickets.length; i++) {
      if (this.tickets[i].flightID == id) {
        console.log("inside if get");
        current = this.tickets[i];
      }
    }
    return current;
  }
  updateTicket(seatNum, flightNum, departure, arrival, travDate, id) {
    for (let i = 0; i < this.tickets.length; i++) {
      if (this.tickets[i].flightID == id) {
        console.log("inside if update");
        this.tickets[i].seatNum = seatNum;
        this.tickets[i].flightNum = flightNum;
        this.tickets[i].departure = departure;
        this.tickets[i].arrival = arrival;
        this.tickets[i].travDate = travDate;
      }
    }
  }
}

module.exports = {
  myClass,
};
