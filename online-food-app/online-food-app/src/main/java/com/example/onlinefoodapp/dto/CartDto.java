package com.example.onlinefoodapp.dto;


import com.example.onlinefoodapp.entity.Cart;
import com.example.onlinefoodapp.entity.Product;

public class CartDto {
        private Long id;
        private Long userId;
        private Integer quantity;
        private Product product;

        public CartDto() {
        }

        public CartDto(Cart cart) {
            this.setId(cart.getId());
            this.setUserId(cart.getUserId());
            this.setQuantity(cart.getQuantity());
            this.setProduct(cart.getProduct());
        }

        @Override
        public String toString() {
            return "CartDto{" +
                    "id=" + id +
                    ", userId=" + userId +
                    ", quantity=" + quantity +
                    ", productName=" + product.getName() +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }


}
