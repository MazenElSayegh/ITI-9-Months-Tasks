async function getUsers() {
  try {
    const response = await fetch(" https://reqres.in/api/users?page=2");
    const data = await response.json();
    return data;
  } catch (error) {
    console.log(error);
  }
}

getUsers().then((data) => {
  let usersArr = data.data;
  const container = document.querySelector(".container");

  usersArr.forEach((user) => {
    let userContainer = document.createElement("div");
    userContainer.classList.add("userContainer");
    userContainer.innerHTML = `
      <div id="image">
            <img
              src="${user.avatar}"
              alt="${user.first_name + " " + user.last_name}"
            />
            <div id="id">
            (${user.id})
        </div>
          </div>
          <div id="name">${user.first_name + " " + user.last_name}</div>
          <div id="email">${user.email}</div>
          `;

    container.append(userContainer);
  });
});
