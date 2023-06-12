let searchForm=document.querySelector('.search-form');

document.querySelector('#search-btn').onclick=()=>{
	searchForm.classList.toggle('active');
	shoppingCart.classList.remove('active');
	loginForm.classList.remove('active');
}

let shoppingCart=document.querySelector('.shopping-cart');

document.querySelector('#cart-btn').onclick=()=>{
	shoppingCart.classList.toggle('active');
	searchForm.classList.remove('active');
	loginForm.classList.remove('active');
}



let loginForm=document.querySelector('.login-form');

document.querySelector('#login-btn').onclick=()=>{
	loginForm.classList.toggle('active');
	searchForm.classList.remove('active');
	shoppingCart.classList.remove('active');
	
}

let all_products = []
let product = {}

var existingEntries = JSON.parse(localStorage.getItem("product_name"));

if (existingEntries !== null) {
	all_products.push(existingEntries);
	let contenElement = document.querySelector("div.content")
	let boxElement = document.createElement("div")
	let output = ''
	let totalPrice = 0
	Object.keys(all_products[0]).forEach((key) => {
		let {name, price, img} = all_products[0][key]
		console.log(name, price, img);
		if(name) {
			const total = parseInt(price.replace ( /[^\d.]/g, '' ))
			totalPrice += total
			output += `<div class="box"> <img src="${img}" alt="" class="cart-img"> <div class="detail-box"> <div class="product-title">${name}</div> <div class="price-cart">${price}</div> <input type="number" value="1" name="cart-quantity"> </div> <i class="fas fa-trash-alt cart-remove"></i> </div>`
		}
	})
	boxElement.innerHTML = output
	contenElement.appendChild(boxElement)
	console.log(totalPrice)
	let totalPriceElement = document.querySelector("div.total-price")
	totalPriceElement.innerHTML += `$${totalPrice}`

	
}

let productNames = document.querySelectorAll("h3.product-title");
let productPrice = document.querySelectorAll("div.price");
let productImages = document.querySelectorAll("img.product-img");

const addProd = (name, price, image) => {
	product.name = name
	product.price = price
	product.img = image

	all_products.push(product)
	product = {}
}

if(document.querySelectorAll('.button')[0].addEventListener("click", ()=> {
	addProd(productNames[0].textContent, productPrice[0].textContent, productImages[0].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[1].addEventListener("click", ()=> {
	addProd(productNames[1].textContent, productPrice[1].textContent, productImages[1].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[2].addEventListener("click", ()=> {
	addProd(productNames[2].textContent, productPrice[2].textContent, productImages[2].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[3].addEventListener("click", ()=> {
	addProd(productNames[3].textContent, productPrice[3].textContent, productImages[3].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[4].addEventListener("click", ()=> {
	addProd(productNames[4].textContent, productPrice[4].textContent, productImages[4].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[5].addEventListener("click", ()=> {
	addProd(productNames[5].textContent, productPrice[5].textContent, productImages[5].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[6].addEventListener("click", ()=> {
	addProd(productNames[6].textContent, productPrice[6].textContent, productImages[6].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[7].addEventListener("click", ()=> {
	addProd(productNames[7].textContent, productPrice[7].textContent, productImages[7].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[8].addEventListener("click", ()=> {
	addProd(productNames[8].textContent, productPrice[8].textContent, productImages[8].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));
if(document.querySelectorAll('.button')[9].addEventListener("click", ()=> {
	addProd(productNames[9].textContent, productPrice[9].textContent, productImages[9].src)
	localStorage.setItem('product_name', JSON.stringify(all_products))
}));

window.onscroll=()=>{
	searchForm.classList.remove('active');
	shoppingCart.classList.remove('active');
	loginForm.classList.remove('active');
	
}

	//cart Working JS
	if(document.readyState=="loading"){
		document.addEventListener("DOMContentLoaded", ready);
	}else{
		ready();
	}
	
	//Making function
	function ready(){
		//Remove Items From Cart
		
		//Quantity changes
		var quantityInputs=document.getElementsByClassName("cart-quantity");
		for(var i=0; i<quantityInputs.length; i++){
			var input=quantityInputs[i];
			input.addEventListener("change", quantityChanged);
		}
		//place order button
		document.getElementsByClassName("button")[0].addEventListener("click",buyButtonClicked);
	}
	//Place oder button
	function buyButtonClicked(){
		alert("Your order is placed");
		var cartContent=document.getElementsByCLassName("content")[0]
		while(cartContent.hasChildNodes()){
			cartContent.removeChild(cartContent.firstChild);
		
		updatetotal();
	}
	
	
	//Remove Items from Cart
	function removeCartItem(event){
		var buttonClicked=event.target;
		buttonClicked.parentElement.remove();
		updatetotal();
	}
	//Quantity changes
	function quantityChanged(event){
		var input=event.target
		if(isNaN(input.value) || input.value<=0){
			input.value=1
		}
		updatetotal();
	}


		


	}